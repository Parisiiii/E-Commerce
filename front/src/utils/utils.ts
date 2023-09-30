export const currencyOf = (value: number | null = 0) => {
    return (value ?? 0).toLocaleString('pt-br', { style: 'currency', currency: 'BRL' });
};
